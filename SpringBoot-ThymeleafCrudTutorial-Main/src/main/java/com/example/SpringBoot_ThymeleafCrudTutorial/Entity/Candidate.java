package com.example.SpringBoot_ThymeleafCrudTutorial.Entity;

//import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class Candidate 
{
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
   
   
    @NotBlank(message = "Number Registration is mandatory")
    @Column(name = "noreg")
    private String noreg;

    @NotBlank(message = "Nama is mandatory")
    @Column(name = "name")
    private String name;


    private String alamat;
    private String merk;
   
    //@Size(min=3, max=4)
    @Min(value = 1900 , message = "Minimal 4 angka atau kurang dari nilai 1900")
    @Max(value= 2024, message = "Tidak lebih dari tahun 2024")
    @Column(name = "tahun")
    private Integer tahun;

    private Integer silinder;
    private String warna;
    private String bhnbakar;

   
    public Candidate() {}

    public Candidate(String noreg, String name, String alamat,String merk, Integer tahun, Integer silinder, String warna, String bhnbakar) {
       this.noreg = noreg;
       this.name = name;
       this.alamat = alamat;
       this.merk = merk;
       this.tahun = tahun;
       this.silinder = silinder;
       this.warna = warna;
       this.bhnbakar = bhnbakar;

       
    }

    public void setId(long id) 
    {
       this.id = id;
    }
   
   public long getId() 
   {
       return id;
   }

    public String getNoreg() 
    {
    return noreg;
    }

    public void setNoreg(String noreg) 
    {
    this.noreg = noreg;
    }

    public String getName() 
    {
    return name;
    }

    public void setName(String name) 
    {
    this.name = name;
    }

    public String getAlamat() 
    {
    return alamat;
    }

    public void setAlamat(String alamat) 
    {
    this.alamat = alamat;
    }

    public String getMerk() 
    {
    return merk;
    }

    public void setMerk(String merk) 
    {
    this.merk = merk;
    }

    public Integer getTahun() 
    {
    return tahun;
    }

    public void setTahun(Integer tahun) 
    {
    this.tahun = tahun;
    }

    public Integer getSilinder() 
    {
    return silinder;
    }

    public void setSilinder(Integer silinder) 
    {
    this.silinder = silinder;
    }

    public String getWarna() 
    {
    return warna;
    }

    public void setWarna(String warna) 
    {
    this.warna = warna;
    }

    public String getBhnbakar() 
    {
    return bhnbakar;
    }

    public void setBhnbakar(String bhnbakar) 
    {
    this.bhnbakar = bhnbakar;
    }
   
}