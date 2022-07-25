package com.example.ppmtool.exceptions;

public class ProjectIdExceptionRespnse {

    private String projectIdentifier;

    public ProjectIdExceptionRespnse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
