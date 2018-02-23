package controller;

import model.Ogrenciler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private final String SQL_FIND_OGRENCI = "SELECT * FROM ogrenciler WHERE kullaniciadi = ? AND sifre = ?";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/login")
    public ModelAndView validate(@RequestParam("kullaniciadi") String kullaniciadi, @RequestParam("sifre") String sifre) {
        ModelAndView modelAndView = null;
        try {
            Ogrenciler ogrenciBean = jdbcTemplate.queryForObject(SQL_FIND_OGRENCI, new LoginRowMapper(),
                    new Object[]{kullaniciadi, sifre});
            modelAndView = new ModelAndView();
            modelAndView.addObject("kullaniciadi", kullaniciadi);
            if (ogrenciBean != null) {
                modelAndView.setViewName("index");
            } else {
                modelAndView = new ModelAndView("loginpage");
                modelAndView.addObject("error", "Kullanıcı adı veya şifre hatalı");
            }
        } catch (EmptyResultDataAccessException e) {
            modelAndView = new ModelAndView("loginpage");
            modelAndView.addObject("error", "Kullanıcı adı veya şifre hatalı");
        }
        return modelAndView;
    }

    private final class LoginRowMapper implements RowMapper<Ogrenciler> {
        @Override
        public Ogrenciler mapRow(ResultSet rs, int arg) throws SQLException {
            return new Ogrenciler(rs.getString("kullaniciadi"), rs.getString("sifre"));
        }
    }

    public List<Ogrenciler> list()
    {
        String sql = "SELECT * FROM ogrenciler";

        List<Ogrenciler> listOgrenciler = jdbcTemplate.query(sql, rs -> {
            List<Ogrenciler> list = new ArrayList<Ogrenciler>();
            while (rs.next())
            {
                Ogrenciler ogrenci = new Ogrenciler();
                ogrenci.setId(rs.getInt(1));
                ogrenci.setIsim(rs.getString(2));
                ogrenci.setSoyisim(rs.getString(3));
                ogrenci.setKullaniciadi(rs.getString(4));
                ogrenci.setSifre(rs.getString(5));
                ogrenci.setDers_id(rs.getInt(6));
                list.add(ogrenci);
            }
            return list;
        });
        return listOgrenciler;
    }


    @RequestMapping(value="/getOgrenciler", method = RequestMethod.GET)
    public ModelAndView listOgrenciler(ModelAndView model) throws IOException {
        List<Ogrenciler> listOgrenciler = list();
        model.addObject("listOgrenciler", listOgrenciler);
        model.setViewName("home");

        return model;
    }

}
