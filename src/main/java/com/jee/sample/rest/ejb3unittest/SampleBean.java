/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jee.sample.rest.ejb3unittest;

import javax.ejb.Stateless;
import javax.ejb.Local;

/**
 *
 * @author martin
 */
@Stateless
@Local(ISample.class)
public class SampleBean implements ISample {

    String str;


    @Override
    public void set(String str) {
        System.out.println("str >>> ");
        this.str = str;

    }

    @Override
    public String get() {
        return this.str;
    }
}
