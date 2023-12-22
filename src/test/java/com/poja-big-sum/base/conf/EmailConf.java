package com.poja-big-sum.base.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja-big-sum.base.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
