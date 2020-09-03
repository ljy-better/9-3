package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table(name="company_monitor_sensor")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String company_code;
    private Integer sys_name;
    private Integer equipment_type_id;
    private String  equipment_type_name;
    private Integer sensor_type_id;
    private String sensor_type_name;
    private Integer technology_type_id;
    private String technology_type_name;
    private String department;
    private String sensor_code;
    private String location;
    private String storage_material;
    private BigDecimal level_alarm_high;
    private BigDecimal secondary_alarm_high;
    private BigDecimal level_alarm_low;
    private BigDecimal secondary_alarm_low;
    private Integer operate_id;
    private String operate_username;
    private Timestamp create_time;
    private Timestamp update_time;
}
