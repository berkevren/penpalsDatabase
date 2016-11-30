package com.be.controller;

import com.be.business.InboxBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jaeger on 15/08/16.
 */
@Controller
@RequestMapping("inbox")
public class InboxController
{
    @Autowired
    InboxBusiness inboxBusiness;

}
