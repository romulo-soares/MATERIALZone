package br.edu.ifpb.tccii.materialzone.integration.service;

import br.edu.ifpb.tccii.materialzone.integration.dto.ResultClassifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "DataCleanerService", url = "http://localhost:5000/sortdata")
public interface ClassifierResultService {

//    @GetMapping("/{content}")
//    ResultClassifier getResultClassification(@PathVariable String content);

    @GetMapping("")
    @ResponseBody
    ResultClassifier getResultClassification(@RequestParam String content);

}


