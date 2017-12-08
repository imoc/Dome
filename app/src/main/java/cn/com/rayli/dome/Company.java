/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.com.rayli.dome;

/**
 * Created by lilxiaowei on 2017-12-07.
 */

public class Company extends Worker {

    private SuperStar superStar;

    @Override
    public void sing() {
        superStar.sing();
    }

    @Override
    public void dance() {
        superStar.dance();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        return superStar != null ? superStar.equals(company.superStar) : company.superStar == null;
    }

    @Override
    public int hashCode() {
        return superStar != null ? superStar.hashCode() : 0;
    }
}
