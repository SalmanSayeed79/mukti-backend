package com.mukti.muktibackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="mukti_user")
public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "user_id", nullable = false)
        private Long user_id;

        @Column(name="email")
        private String email;

    @Column(name="phone")
    private String phone;

        @Column(name="name")
        private String name;

        @Column(name="name_bangla")
        private String name_bangla;

        @Column(name="user_type")
        private String user_type;

        @Column(name="user_type_bangla")
        private String user_type_bangla;

        @Column(name="institute")
        private String institute;

        @Column(name="institute_bangla")
        private String institute_bangla;

        @Column(name="address")
        private String address;

        @Column(name="address_bangla")
        private String address_bangla;

        @Column(name="image")
        private String image;

        public User(){

        }

    public User(Long user_id, String email, String phone, String name, String name_bangla, String user_type, String user_type_bangla, String institute, String institute_bangla, String address, String address_bangla, String image) {
        this.user_id = user_id;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.name_bangla = name_bangla;
        this.user_type = user_type;
        this.user_type_bangla = user_type_bangla;
        this.institute = institute;
        this.institute_bangla = institute_bangla;
        this.address = address;
        this.address_bangla = address_bangla;
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName_bangla() {
        return name_bangla;
    }

    public void setName_bangla(String name_bangla) {
        this.name_bangla = name_bangla;
    }

    public String getUser_type_bangla() {
        return user_type_bangla;
    }

    public void setUser_type_bangla(String user_type_bangla) {
        this.user_type_bangla = user_type_bangla;
    }

    public String getInstitute_bangla() {
        return institute_bangla;
    }

    public void setInstitute_bangla(String institute_bangla) {
        this.institute_bangla = institute_bangla;
    }

    public String getAddress_bangla() {
        return address_bangla;
    }

    public void setAddress_bangla(String address_bangla) {
        this.address_bangla = address_bangla;
    }

    public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }



        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUser_type() {
            return user_type;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
        }

        public String getInstitute() {
            return institute;
        }

        public void setInstitute(String institute) {
            this.institute = institute;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Long getUser_id() {
            return user_id;
        }

        public void setUser_id(Long user_id) {
            this.user_id = user_id;
        }
    }

