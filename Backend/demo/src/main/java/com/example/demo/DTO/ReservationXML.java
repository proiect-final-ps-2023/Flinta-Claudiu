package com.example.demo.DTO;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement(name = "reservation")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReservationXML {

    @XmlElement(name = "start-date")
    private Date startDate;

    @XmlElement(name = "end-date")
    private Date endDate;

    @XmlElement(name = "hotel-address")
    private String hotelAddress;

    @XmlElement(name = "hotel-email")
    private String hotelEmail;

    @XmlElement(name = "hotel-phone")
    private Long hotelPhone;

    @XmlElement(name = "user-first-name")
    private String firstName;

    @XmlElement(name = "user-last-name")
    private String lastName;

    @XmlElement(name = "user-email")
    private String email;

    @XmlElement(name = "room-name")
    private String roomName;

    @XmlElement(name = "price-per-night")
    private Float pricePerNight;

    public ReservationXML() {}

    public ReservationXML(Date startDate, Date endDate, String hotelAddress, String hotelEmail, Long hotelPhone, String firstName, String lastName, String email, String roomName, Float pricePerNight) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.hotelAddress = hotelAddress;
        this.hotelEmail = hotelEmail;
        this.hotelPhone = hotelPhone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roomName = roomName;
        this.pricePerNight = pricePerNight;
    }
}
