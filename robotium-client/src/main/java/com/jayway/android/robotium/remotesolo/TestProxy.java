package com.jayway.android.robotium.remotesolo;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InterfaceMaker;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.Proxy;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.TraceClassVisitor;
import org.powermock.reflect.Whitebox;

import com.jayway.android.robotium.remotesolo.proxy.FinalClassInterfaceMaker;
import com.jayway.android.robotium.remotesolo.proxy.InterfaceAdder;
import com.jayway.android.robotium.remotesolo.proxy.ProxyMessageContainer;
import com.jayway.android.robotium.remotesolo.proxy.MyClassLoader;
import com.jayway.android.robotium.solo.Solo;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;



public class TestProxy {


	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		Class<?> mClass;
//		try {
//			mClass = Class.forName("android.view.View");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			mClass = null;
//		}
//		View vc = (View) Whitebox.newInstance(mClass);
//		View px = (View) MethodCallReceiver.createProxy(vc);
//		px.getViewTreeObserver();
		
//		Class<?> mClass;
//		try {
//			mClass = Class.forName("android.view.ViewTreeObserver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			mClass = null;
//		}
//		android.view.ViewTreeObserver vc = (android.view.ViewTreeObserver) Whitebox.newInstance(mClass);
//		
//		
//		Class[] classes = {android.view.ViewTreeObserver.class};
//		android.view.ViewTreeObserver obj = (android.view.ViewTreeObserver) java.lang.reflect.Proxy.newProxyInstance(android.view.ViewTreeObserver.class.getClassLoader(), classes,
//				new InvocationHandler() {
//
//				public Object invoke(Object proxy, Method method, Object[] args)
//						throws Throwable {
//					// TODO Auto-generated method stub
//					return null;
//				}
//				});
		
//		''''''''''
//		MyClassLoader ld = new MyClassLoader();
//		Class newTreeViewClass = null;
//		try {
//			newTreeViewClass = ld.loadClassWithInterface("android.view.ViewTreeObserver");
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
//		ListView lv = Whitebox.newInstance(ListView.class);
//		ListView proxobj = (ListView) ProxyMessageContainer.createProxy(lv);
//		proxobj.findFocus();
		ProxyMessageContainer pmc = new ProxyMessageContainer();
		Solo solo = (Solo) pmc.createProxy(Solo.class);
		try {
			Whitebox.invokeMethod(solo, "goBack");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
