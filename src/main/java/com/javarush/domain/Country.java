package com.javarush.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(schema = "world", name = "country")
public class Country {
    @Id
    private Integer id;
    @Column(length = 3, nullable = false)
    private String code;
    @Column(name = "code_2", length = 2, nullable = false)
    private String code2;
    @Column(length = 52, nullable = false)
    private String name;
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Continent continent;
    @Column(length = 26, nullable = false)
    private String region;
    @Column(name = "surface_area", columnDefinition = "decimal(10,2)")
    //@Column(name = "surface_area", precision = 10, scale = 2)
    private BigDecimal surfaceArea;
    @Column(name = "indep_year")
    private Short indepYear;
    @Column(nullable = false)
    private Integer population;
    @Column(name = "life_expectancy", columnDefinition = "decimal(3,1)")
    //@Column(name = "life_expectancy", precision = 3, scale = 1)
    private BigDecimal lifeExpectancy;
    @Column(columnDefinition = "decimal(10,2)", nullable = false)
    //@Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal gnp;
    @Column(name = "gnpo_id", columnDefinition = "decimal(10,2)")
    //@Column(name = "gnpo_id", precision = 10, scale = 2)
    private BigDecimal gnpoId;
    @Column(name = "local_name", length = 45, nullable = false)
    private String localName;
    @Column(name = "government_form", length = 45, nullable = false)
    private String governmentForm;

    @Column(name = "head_of_state", length = 60)
    private String headOfState;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Short indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    public BigDecimal getGnpoId() {
        return gnpoId;
    }

    public void setGnpoId(BigDecimal gnpoId) {
        this.gnpoId = gnpoId;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<CountryLanguage> languages) {
        this.languages = languages;
    }
}
