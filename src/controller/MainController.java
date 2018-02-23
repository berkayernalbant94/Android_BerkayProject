package controller;

import model.Ogrenciler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.ResultSet;
import java.sql.SQLException;

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



}
