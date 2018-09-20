# PageTransformerHelp

[![GitHub issues](https://img.shields.io/github/issues/OCNYang/PageTransformerHelp.svg)](https://github.com/OCNYang/PageTransformerHelp/issues)&ensp;&ensp;[![GitHub forks](https://img.shields.io/github/forks/OCNYang/PageTransformerHelp.svg)](https://github.com/OCNYang/PageTransformerHelp/network)&ensp;&ensp;[![GitHub stars](https://img.shields.io/github/stars/OCNYang/PageTransformerHelp.svg)](https://github.com/OCNYang/PageTransformerHelp/stargazers)  

This is a PageTransformer library for Android ViewPager;There are many custom PageTransformer styles.Be able to help you when you use ViewPager.  

[![Version Code](https://img.shields.io/badge/Version%20Code-1.0.1-brightgreen.svg)](https://github.com/OCNYang/PageTransformerHelp/releases)  

**[关于 ViewPager 的各种用法详解教程](http://www.jianshu.com/p/f8bf9e8b0a39)**  

**[Download the demo apk](https://github.com/OCNYang/PageTransformerHelp/raw/master/apk/app-release.apk)**  

## Styles  

**Banner Style**  

| Style Name | Demo Pic |
| ------------- |:-------------:|
| AccordionTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/AccordionTransformer.gif" width = "600" alt="AccordionTransformer" align=center /> |
| BackgroundToForegroundTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/BackgrounToFore.gif" width = "600" alt="BackgroundToForegroundTransformer" align=center /> |
| CubeInTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/CubeInTransformer.gif" width = "600" alt="CubeInTransformer" align=center /> |
| CubeOutTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/CubeOutTransformer.gif" width = "600" alt="CubeOutTransformer" align=center /> |
| DepthPageTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/DepthPageTransformer.gif" width = "600" alt="DepthPageTransformer" align=center /> |
| FlipHorizontalTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/FlipHorizontalTransformer.gif" width = "600" alt="FlipHorizontalTransformer" align=center /> |
| FlipVerticalTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/FlipVerticalTransformer.gif" width = "600" alt="FlipVerticalTransformer" align=center /> |
| ForegroundToBackgroundTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/ForegroundToBackground.gif" width = "600" alt="ForegroundToBackgroundTransformer" align=center /> |
| ParallaxTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/ParallaxTransformer.gif" width = "600" alt="ParallaxTransformer" align=center /> |
| RotateDownTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/RotateDownTransformer.gif" width = "600" alt="RotateDownTransformer" align=center /> |
| RotateUpTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/RotateUpTransformer.gif" width = "600" alt="RotateUpTransformer" align=center /> |
| ScaleInOutTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/ScaleInOutTransformer.gif" width = "600" alt="ScaleInOutTransformer" align=center /> |
| StackTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/StackTransformer.gif" width = "600" alt="StackTransformer" align=center /> |
| TabletTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/TabletTransformer.gif" width = "600" alt="TabletTransformer" align=center /> |
| ZoomInTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/ZoomInTransformer.gif" width = "600" alt="ZoomInTransformer" align=center /> |
| ZoomOutSlideTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/ZoomOutSlideTransformer.gif" width = "600" alt="ZoomOutSlideTransformer" align=center /> |
| ZoomOutTranformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/ZoomOutTranformer.gif" width = "600" alt="ZoomOutTranformer" align=center /> |


**Card Style**  

| Style Name | Demo Pic |
| ------------- |:-------------:|
| AlphaAndScalePageTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/card/AlphaAndScalePageTransformer.gif" width = "400" alt="AlphaAndScalePageTransformer" align=center /> |
| AlphaPageTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/card/AlphaPageTransformer.gif" width = "400" alt="AlphaPageTransformer" align=center /> |
| CascadingPageTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/card/CascadingPageTransformer.gif" width = "400" alt="CascadingPageTransformer" align=center /> |
| RotateDownPageTransformer | <img src="https://raw.githubusercontent.com/OCNYang/PageTransformerHelp/master/img/card/RotateDownPageTransformer.gif" width = "400" alt="RotateDownPageTransformer" align=center /> |


## Download  

You can download a jar from GitHub's [releses page](https://github.com/OCNYang/PageTransformerHelp/releases).  

Or use Gradle:  
**Step 1.** Add it in your root build.gradle at the end of repositories  

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

**Step 2.** Add the dependency  

	dependencies {
        compile 'com.github.OCNYang:PageTransformerHelp:v1.0.1'
	}

Or Maven:  
**Step 1.**  

	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

**Step 2.**  

	<dependency>
	    <groupId>com.github.OCNYang</groupId>
	    <artifactId>PageTransformerHelp</artifactId>
	    <version>v1.0.1</version>
	</dependency>


## How do I use PageTransformerHelp?  

### Use Banner Style  

Add your ViewPager in XML;And then:  

	...
	mViewPager = ((ViewPager) findViewById(R.id.viewPager));
	mViewPager.setPageTransformer(true,new ParallaxTransformer());
	...

If you want a ViewPager with Title and Indicator,We recommend that you customize a ViewPager.  
Here is an BannerViewPager for your reference, but we do not recommend that you use it directly unless it meets your requirements.  
PageTransformerHelp 内提供了一种带有标题和指示器的 BannerViewPager，这里只是供大家根据需求自定义 ViewPager 时作为参考（大家只需要复制里面的代码，修改一下标题和指示器的布局文件即可）。不建议直接使用，如果你愿意也可以直接使用。  

**Use BannerViewPager**  

Add BannerViewPager in your XML;And then:  

	mBannerViewPager = ((BannerViewPager) findViewById(R.id.bannerViewPager));
	mBannerViewPager
		.setData(List<BannerItemBean>,//set data
		    new ImageLoaderInterface() {
		        @Override
		        public void displayImage(Context context, Object imgPath, ImageView imageView) {
                    //Set your own image loading method according to your needs
                    //Glide.with(context).load(imgPath).into(imageView);
		        }
	    })
        .setPageTransformer(new ParallaxTransformer())
	    .setAutoPlay(false)
	    .setOnBannerItemClickListener(new BannerViewPager.OnBannerItemClickListener() {
	        @Override
	        public void OnClickLister(View view, int currentItem) {
	            ...
	        }
	    })
	    .setHaveTitle(true);//set the title show or hide

### Use Card Style  

Add ViewPager in XML:  

	<LinearLayout
	    ...
	    android:clipChildren="false"
        ...>
		...
		<android.support.v4.view.ViewPager
            ...
            android:layout_marginLeft="80dp"
            android:layout_marginRight="80dp"
            android:clipChildren="false"
            .../>
		...
	</LinearLayout>

You should set `android:clipChildren="false"` for your ViewPager and ViewPager's parent;And set `layout_marginLeft`、`layout_marginRight`for your ViewPager.  
And then set `setPageMargin`、`setPageTransformer` in the code:  

	...
	mViewPager = ((ViewPager) findViewById(R.id.cardViewPager));
	mViewPager.setOffscreenPageLimit(3);
	mViewPager.setPageMargin(40);
	mViewPager.setPageTransformer(true,new AlphaPageTransformer());
	mViewPager.setAdapter(...
	...


## In the end  

If you have some other nice PageTransformer, you can [create a pull request](https://github.com/OCNYang/PageTransformerHelp/pulls). If you find some bugs,tell me through [create an issue](https://github.com/OCNYang/PageTransformerHelp/issues).  

**Like it please give me a star.**   

如果你有更好的自定义 PageTransformer 可以提交给我；  
同时如果你喜欢这个项目，欢迎 Star。  

关于这篇文章更详细的教程，请看：**[ViewPager 超详解：玩出十八般花样](http://www.jianshu.com/p/f8bf9e8b0a39)**  

## Thanks  

* [banner](https://github.com/youth5201314/banner)  
* [MagicViewPager](https://github.com/hongyangAndroid/MagicViewPager)  

## LICENSE

Copyright 2017 https://github.com/OCNYang | OCN.Yang

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
   limitations under the License.
