package com.xworkz.iphone;

import com.xworkz.application.AppName;
import com.xworkz.mobile.MobileDto;
import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IphoneSeries extends MobileDto {
      private String iphoneModelName;
      private String icloudStorage;

private AppName appName;
}
