package com.ocnyang.pagetransformerhelp;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2017/12/6 15:32.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class BannerItemBean {
    Object img_path;
    String title;

    public BannerItemBean(Object img_path, String title) {
        this.img_path = img_path;
        this.title = title;
    }

    public BannerItemBean(Object img_path) {
        this.img_path = img_path;
    }

    public BannerItemBean() {
    }

    public Object getImg_path() {
        return img_path;
    }

    public void setImg_path(Object img_path) {
        this.img_path = img_path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
