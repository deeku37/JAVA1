package com.xworkz.cricket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CricketDto {
      private String cricketPlayerName;
      private String cricketMatchLocation;
      private int cricketMatchDate;

      @Override
      public String toString(){
          return "cricketPlayerName" + cricketPlayerName + " , " + "cricketMatchLocation" +cricketMatchLocation+ " , " + "cricketMatchDate" +cricketMatchDate ;
      }
}

