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

/**
 * Контроллер для сущности "детектор".
 */
@Controller
public class DetectorController {

    /**
     * Репозиторий детектора.
     */
    @Autowired
    private DetectorRepo detectorRepo;

    /**
     * Передает для оторбражения детектор.
     * @param model модель
     * @return детектор
     */
    @GetMapping("/")
    public String getDetectorInfo(Model model) {
        Optional<Detector> detector = detectorRepo.findById(1);
        model.addAttribute("detector", detector.get());
        return "detector";
    }

}
