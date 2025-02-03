package org.dnyanyog.controller;

import org.dnyanyog.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService = new StudentService();

    @GetMapping("/name/{ID}")
    public String getStudentName(@PathVariable String ID) {
        return studentService.getStud_Name(ID);
    }

    @GetMapping("/email/{ID}")
    public String getStudentEmail(@PathVariable String ID) {
        return studentService.getStud_Email(ID);
    }

    @GetMapping("/mobile/{ID}")
    public String getStudentMobile(@PathVariable String ID) {
        return studentService.getStud_Mob(ID);
    }
}
