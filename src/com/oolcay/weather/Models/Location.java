package com.oolcay.weather.Models;

public class Location {

  private int mId;
  private String mName;
  private double mLat;
  private double mLon;
  private long mLastUpdated;

  public Location(){
    mLastUpdated = -1;
  }

  public Location(String name, double lat, double lon){
    mName = name;
    mLat = lat;
    mLon = lon;
  }

  public long getLastUpdated(){
    return mLastUpdated;
  }

  public String getName(){
    return mName;
  }

  public double getLat(){
    return mLat;
  }

  public double getLon(){
    return mLon;
  }

  public int getId(){
    return mId;
  }

  public void setLastUpdated(long updated){
    mLastUpdated = updated;
  }

  public void setId(int id){
    mId = id;
  }

  public void setName(String name){
    mName = name;
  }

  public void setLat(double lat){
    mLat = lat;
  }

  public void setLon(double lon){
    mLon = lon;
  }
}
