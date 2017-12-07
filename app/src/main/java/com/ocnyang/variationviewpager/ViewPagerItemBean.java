package com.ocnyang.variationviewpager;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2017/12/6 10:51.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class ViewPagerItemBean {
    int img_url;
    String tilte_text;

    public ViewPagerItemBean(int img_url, String tilte_text) {
        this.img_url = img_url;
        this.tilte_text = tilte_text;
    }

    public int getImg_url() {
        return img_url;
    }

    public void setImg_url(int img_url) {
        this.img_url = img_url;
    }

    public String getTilte_text() {
        return tilte_text;
    }

    public void setTilte_text(String tilte_text) {
        this.tilte_text = tilte_text;
    }
}
