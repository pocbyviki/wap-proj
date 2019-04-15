package com.wap.designpattern;

import java.awt.Container;
import java.awt.Desktop;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.ResourceBundle;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathFactory;

public class DesignPatternsUsedByJavaAPI implements Cloneable{

	
public static void main(String[] args) throws CloneNotSupportedException, SQLException {
	 //---------------1-Creational Pattern----------------------- #
	
	// 1- Abstract Factory
	DocumentBuilderFactory.newInstance();
	TransformerFactory.newInstance();
	XPathFactory.newInstance();
	
	//2- Builder Pattern
	new StringBuilder().append("abc");
	new StringBuffer().append("abc");
	
	//3- Factory Pattern
	Calendar c = Calendar.getInstance();
	NumberFormat n =NumberFormat.getInstance();
	ResourceBundle rb= ResourceBundle.getBundle("");
	
	//4-Prototype Pattern
	new DesignPatternsUsedByJavaAPI().clone(); // Object#clone()
	
	//5-Singleton Pattern
	Runtime.getRuntime();
	SecurityManager sm = System.getSecurityManager();
	Desktop.getDesktop();
	DriverManager.getConnection("url");
	

	//-------------------------2- Structural Design Pattern-------------------------
	
	//1- Adopter Pattern
	Arrays.asList(new Object());
	Collections.list(null);
	Collections.enumeration(null);
	InputStreamReader reader;
	
	//2- Bridge Pattern
	
	//3- Composite Pattern
	
	//4- Decorator Pattern
	/**
	 * # All subclasses of java.io.InputStream, OutputStream, Reader and Writer have a constructor taking an instance of same type.
	   # java.util.Collections, the checkedXXX(), synchronizedXXX() and unmodifiableXXX() methods.
	 */
	
	//5- Facade Pattern
	/**
	 * # javax.faces.context.FacesContext, it internally uses among others the abstract/interface types LifeCycle, ViewHandler, 
	 * NavigationHandler and many more without that the enduser has to worry about it (which are however overrideable by injection).
	   # javax.faces.context.ExternalContext, which internally uses ServletContext, HttpSession, HttpServletRequest, HttpServletResponse, etc
	 */
	
	//6-FlyWeight Pattern
	/**
	 * java.lang.Integer#valueOf(int) (also on Boolean, Byte, Character, Short, Long and BigDecimal
	 */
	
	//7- Proxy Pattern
	/**
	 *  java.lang.reflect.Proxy
		java.rmi.*
		javax.ejb.EJB (explanation here)
		javax.inject.Inject (explanation here)
		javax.persistence.PersistenceContext
	 */
	
	//--------------------------3- Behavioral patterns-------------------------------
	
	//1-Chain of responsibility
	/**
	 * 	java.util.logging.Logger#log()
		javax.servlet.Filter#doFilter()
	 */
	
	//2- Command Pattern
	/**
	 * 	All implementations of java.lang.Runnable
		All implementations of javax.swing.Action
	 */
	
	//3-Interpreter Pattern
	/**
	 * java.util.Pattern
		java.text.Normalizer
		All subclasses of java.text.Format
		All subclasses of javax.el.ELResolver
	 */
	
	//4- Iterator Pattern
	/**
	 * 	All implementations of java.util.Iterator (thus among others also java.util.Scanner!).
		All implementations of java.util.Enumeration
	 */
	
	//5-Observer Pattern
	/**
	 * java.util.Observer/java.util.Observable (rarely used in real world though)
All implementations of java.util.EventListener (practically all over Swing thus)
javax.servlet.http.HttpSessionBindingListener
javax.servlet.http.HttpSessionAttributeListener
javax.faces.event.PhaseListener
	 */
	
	//6- Strategy Pattern
	/**
	 * java.util.Comparator#compare(), executed by among others Collections#sort().
javax.servlet.http.HttpServlet, the service() and all doXXX() methods take HttpServletRequest and HttpServletResponse and the implementor has to process them (and not to get hold of them as instance variables!).
javax.servlet.Filter#doFilter()
	 */

	//7-Template Pattern
	/**
	 * All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
javax.servlet.http.HttpServlet, all the doXXX() methods by default sends a HTTP 405 "Method Not Allowed" error to the response. You're free to implement none or any of them.
	 */
	
	//8-Visitor Pattern
	
	
}
}
