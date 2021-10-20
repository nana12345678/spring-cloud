package com.liuna.springcloudjdbcmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudJdbcManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudJdbcManageApplication.class, args);
        System.out.println("这是demand_insert的修改内容");
        System.out.println("这是insert的第二次修改");

        System.out.println("feature/hamei_test_demand这是insert的第三次修改");

        System.out.println("hamei_update_1 commit 第一次");
        System.out.println("hamei_update_1 commit 第二次");

        System.out.println("hamei_update_1 commit 第三次");

        System.out.println("hamei_update_1 commit 第四次");

        System.out.println("hamei_update_1 commit 第5⃣五次");

        System.out.println("hamei_update_1 commit 第六次");
    }

}
