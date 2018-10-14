package ru.detector.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.detector.domain.Detector;
import ru.detector.repos.DetectorRepo;

@RestController
public class RestDetectorController {

    @Autowired
    private DetectorRepo detectorRepo;

    @RequestMapping(path = "/api/detector", method = RequestMethod.GET)
    public Detector getDetector() {
        final int detectorId = 1;
        return detectorRepo.findById(detectorId).get();
    }
}
