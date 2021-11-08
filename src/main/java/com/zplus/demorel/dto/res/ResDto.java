package com.zplus.demorel.dto.res;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class ResDto {

       private Integer compId;
       private String companyName;
       private String address;
       private String status;


       public ResDto(Integer compId, String companyName, String address, String status ) {
              this.compId = compId;
              this.companyName = companyName;
              this.address = address;
              this.status = status;

       }


}