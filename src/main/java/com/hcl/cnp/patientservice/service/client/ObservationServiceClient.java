package com.hcl.cnp.patientservice.service.client;

import com.hcl.cnp.patientservice.domain.Observation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Tech Support on 7/29/2018.
 */
@Service
@FeignClient(name = "observation-service")
public interface ObservationServiceClient {

    @GetMapping(path = "/patient/{patientId}")
    List<Observation> findByPatient(@PathVariable("patientId") String patientId);

}
