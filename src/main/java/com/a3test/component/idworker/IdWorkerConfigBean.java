package com.a3test.component.idworker;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "idworker")
public class IdWorkerConfigBean {
    private Long epoch = 1577836800000L;
    private Integer projectid = 0;
    private Integer nodeid = 0;

    public Long getEpoch() {
        return epoch;
    }

    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getNodeid() {
        return nodeid;
    }

    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }
}
