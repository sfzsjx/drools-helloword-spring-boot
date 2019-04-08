package com.gree.drools.service.impl;

import com.gree.drools.domain.Message;
import com.gree.drools.service.DroolsService;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

/**
 * Create by sfz
 * time 2019/04/08
 */
@Service("droolsService")
public class DroolsServiceImpl implements DroolsService {
    public String fireRule(){
        //load up the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kieContainer = ks.getKieClasspathContainer();
        KieSession kSession = kieContainer.newKieSession("kession-rules");

        //go
        Message message = new Message();
        message.setMessage("Hello World");
        message.setStatus(Message.HELLO);
        kSession.insert(message);//插入
        kSession.fireAllRules();//执行规则
        kSession.dispose();
        return message.getMessage();
    }
}
