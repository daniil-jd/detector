package ru.detector.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.detector.domain.Detector;
import ru.detector.repos.DetectorRepo;

import java.util.Map;
import java.util.Optional;

@Controller
public class DetectorController {

    @Autowired
    private DetectorRepo detectorRepo;

    @GetMapping("/")
    public String getDetectorInfo(Model model) {
        Optional<Detector> detector = detectorRepo.findById(1);
        model.addAttribute("detector", detector.get());
        return "detector";
    }

}
