package kg.edu.iaau.com.dao;

import kg.edu.iaau.com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Controller("daoCustomer")
public class DaoCustomer {

    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        jdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Customer> getCustomers(){
        return jdbcTemplate.query("SELECT * FROM customers", new RowMapper<Customer>() {
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                Customer customer=new Customer();
                customer.setId(resultSet.getInt(1));
                customer.setCompany(resultSet.getString(2));
                customer.setLast_name(resultSet.getString(3));
                customer.setFirst_name(resultSet.getString(4));
                customer.setEmail_address(resultSet.getString(5));
                customer.setJob_title(resultSet.getString(6));
                customer.setBusiness_phone(resultSet.getString(7));
                customer.setHome_phone(resultSet.getString(8));
                customer.setMobile_phone(resultSet.getString(9));
                customer.setFax_number(resultSet.getString(10));
                customer.setAddress(resultSet.getString(11));
                customer.setCity(resultSet.getString(12));
                customer.setState_province(resultSet.getString(13));
                customer.setZip_postal_code(resultSet.getString(14));
                customer.setCountry_region(resultSet.getString(15));
                customer.setWeb_page(resultSet.getString(16));
                customer.setNotes(resultSet.getString(17));
                return customer;
            }
        });
    }
    public Customer getCustomers(int id){
        MapSqlParameterSource param=new MapSqlParameterSource("id",id);

        return jdbcTemplate.queryForObject("SELECT * FROM customers where id=:id",param, new RowMapper<Customer>() {
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                Customer customer=new Customer();
                customer.setId(resultSet.getInt(1));
                customer.setCompany(resultSet.getString(2));
                customer.setLast_name(resultSet.getString(3));
                customer.setFirst_name(resultSet.getString(4));
                customer.setEmail_address(resultSet.getString(5));
                customer.setJob_title(resultSet.getString(6));
                customer.setBusiness_phone(resultSet.getString(7));
                customer.setHome_phone(resultSet.getString(8));
                customer.setMobile_phone(resultSet.getString(9));
                customer.setFax_number(resultSet.getString(10));
                customer.setAddress(resultSet.getString(11));
                customer.setCity(resultSet.getString(12));
                customer.setState_province(resultSet.getString(13));
                customer.setZip_postal_code(resultSet.getString(14));
                customer.setCountry_region(resultSet.getString(15));
                customer.setWeb_page(resultSet.getString(16));
                customer.setNotes(resultSet.getString(17));
                return customer;
            }
        });
    }
}
