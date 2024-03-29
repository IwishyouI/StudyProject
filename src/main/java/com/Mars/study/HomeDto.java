package com.Mars.study;


import jakarta.persistence.*;

@Entity
@Table(name = "mars_api_preferences")
public class HomeDto {

    private Long id;
    private Long userId;
    private String marsApiRoverData;

    private Integer marsSol;

    private Boolean defaultCheck1;

    private Boolean FHAZ;
    private Boolean RHAZ;
    private Boolean MAST;

    private Boolean MARDI;
    private Boolean CHEMCAM;
    private Boolean MAHLI;
    private Boolean NAVCAM;
    private Boolean PANCAM;
    private Boolean MINITES;

    private Boolean rememberPreferences;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    @Column(nullable = false)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getMARDI() {
        return MARDI;
    }

    public void setMARDI(Boolean MARDI) {
        this.MARDI = MARDI;
    }

    @Column(length = 20)
    public String getMarsApiRoverData() {
        return marsApiRoverData;
    }

    public void setMarsApiRoverData(String marsApiRoverData) {
        this.marsApiRoverData = marsApiRoverData;
    }

    public Integer getMarsSol() {
        return marsSol;
    }

    public void setMarsSol(Integer marsSol) {
        this.marsSol = marsSol;
    }

    public Boolean getDefaultCheck1() {
        return defaultCheck1;
    }

    public void setDefaultCheck1(Boolean defaultCheck1) {
        this.defaultCheck1 = defaultCheck1;
    }

    public Boolean getFHAZ() {
        return FHAZ;
    }

    public void setFHAZ(Boolean FHAZ) {
        this.FHAZ = FHAZ;
    }

    public Boolean getRHAZ() {
        return RHAZ;
    }

    public void setRHAZ(Boolean RHAZ) {
        this.RHAZ = RHAZ;
    }

    public Boolean getMAST() {
        return MAST;
    }

    public void setMAST(Boolean MAST) {
        this.MAST = MAST;
    }

    public Boolean getCHEMCAM() {
        return CHEMCAM;
    }

    public void setCHEMCAM(Boolean CHEMCAM) {
        this.CHEMCAM = CHEMCAM;
    }

    public Boolean getMAHLI() {
        return MAHLI;
    }

    public void setMAHLI(Boolean MAHLI) {
        this.MAHLI = MAHLI;
    }

    public Boolean getNAVCAM() {
        return NAVCAM;
    }

    public void setNAVCAM(Boolean NAVCAM) {
        this.NAVCAM = NAVCAM;
    }

    public Boolean getPANCAM() {
        return PANCAM;
    }

    public void setPANCAM(Boolean PANCAM) {
        this.PANCAM = PANCAM;
    }

    public Boolean getMINITES() {
        return MINITES;
    }

    public void setMINITES(Boolean MINITES) {
        this.MINITES = MINITES;
    }


    public Boolean getRememberPreferences() {
        return rememberPreferences;
    }

    public void setRememberPreferences(Boolean rememberPreferences) {
        this.rememberPreferences = rememberPreferences;
    }

    @Override
    public String toString() {
        return "HomeDto{" +
                "userId=" + userId +
                ", marsApiRoverData='" + marsApiRoverData + '\'' +
                ", marsSol=" + marsSol +
                ", defaultCheck1=" + defaultCheck1 +
                ", FHAZ=" + FHAZ +
                ", RHAZ=" + RHAZ +
                ", MAST=" + MAST +
                ", MARDI=" + MARDI +
                ", CHEMCAM=" + CHEMCAM +
                ", MAHLI=" + MAHLI +
                ", NAVCAM=" + NAVCAM +
                ", PANCAM=" + PANCAM +
                ", MINITES=" + MINITES +
                ", rememberPreferences=" + rememberPreferences +
                '}';
    }
}
