package org.Spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//public class Triangle implements InitializingBean,DisposableBean{
	public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}

/*	@Override
	public void destroy() throws Exception {
		System.out.println("The Destroy bean has been executed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("The Inititlization bean has been executed");		
	}*/
	public void init(){
		System.out.println("intialization method");
	}
	public void destroy(){
		System.out.println("destruction method");
	}
}
