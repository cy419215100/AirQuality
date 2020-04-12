package cn.kgc.vo;


import java.io.Serializable;

public class Airquality implements Serializable{

  private Integer id;
  private Integer areaId;
  private String monitorTime;
  private Integer pm10;
  private Integer pm25;
  private String monitoringStation;
  private String lastModifyTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getAreaId() {
    return areaId;
  }

  public void setAreaId(Integer areaId) {
    this.areaId = areaId;
  }


  public String getMonitorTime() {
    return monitorTime;
  }

  public void setMonitorTime(String monitorTime) {
    this.monitorTime = monitorTime;
  }


  public Integer getPm10() {
    return pm10;
  }

  public void setPm10(Integer pm10) {
    this.pm10 = pm10;
  }


  public Integer getPm25() {
    return pm25;
  }

  public void setPm25(Integer pm25) {
    this.pm25 = pm25;
  }


  public String getMonitoringStation() {
    return monitoringStation;
  }

  public void setMonitoringStation(String monitoringStation) {
    this.monitoringStation = monitoringStation;
  }


  public String getLastModifyTime() {
    return lastModifyTime;
  }

  public void setLastModifyTime(String lastModifyTime) {
    this.lastModifyTime = lastModifyTime;
  }

  @Override
  public String toString() {
    return "Airquality{" + "id=" + id + ", areaId=" + areaId + ", monitorTime='" + monitorTime + '\'' + ", pm10=" + pm10 + ", pm25=" + pm25 + ", monitoringStation='" + monitoringStation + '\'' + ", lastModifyTime='" + lastModifyTime + '\'' + '}';
  }

}
