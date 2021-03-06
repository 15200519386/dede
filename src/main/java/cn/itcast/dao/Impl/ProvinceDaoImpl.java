package cn.itcast.dao.Impl;

import cn.itcast.dao.ProvinceDao;
import cn.itcast.domain.Province;
import cn.itcast.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProvinceDaoImpl implements ProvinceDao {
    private JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Province> findAll() {
        String sql="select * from province";
        List<Province> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Province>(Province.class));

        return list;
    }
}
