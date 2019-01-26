package com.linyang.contorller;

import java.util.Date;

import com.linyang.common.R;
import com.linyang.model.Student;
import com.linyang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("save")
    public void save(String name, long age, String TheClass, String address, Date birthday, String comprehensive, String comments) {
        studentService.save(new Student().set("name", name).set("address", address).set("birthday", birthday)
                .set("comprehensive", comprehensive).set("comments", comments).set("age", age).set("TheClass", TheClass));
    }

    @PostMapping("delete")
    public void delete(long id) {
        studentService.delete(id);
    }

    @PostMapping("update")
    public void update(long id, String TheClass, long age, String name, String address, Date birthday, String comprehensive, String comments) {
        studentService.update(id, TheClass, age, name, address, birthday, comprehensive, comments);
    }

    @GetMapping("page")
    public R page(String name) {
        return R.ok().setData(studentService.page(name));
    }
}
