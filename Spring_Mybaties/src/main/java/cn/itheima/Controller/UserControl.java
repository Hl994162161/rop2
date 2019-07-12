package cn.itheima.Controller;

import cn.itheima.Service.UserService;
import cn.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/first")
public class UserControl {
    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    public String findById(Model model){
       model.addAttribute("item",userService.findById(1));
        return "itemDetail";
    }
}
