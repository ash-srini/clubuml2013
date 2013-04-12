package controller.comparer.xmi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import controller.merge.xmi.xclass.XmiMergedClass;

public final class Utility {

	/**
	 * Gets the primitive element from the ArrayList of XmiTypeElement
	 * 
	 * @param array
	 *            of XmiTypeElement
	 * @param id
	 *            of target element
	 * @return XmiTypeElement if found, else ""
	 */
	public static String getPrimitiveNameById(ArrayList<XmiTypeElement> array,
			String id) {

		for (XmiTypeElement element : array) {
			if (element.getId().equals(id)) {
				return element.getName();
			}
		}
		return "";
	}

	/**
	 * Gets the Class element from the ArrayList of XmiClassElement
	 * 
	 * @param array
	 *            of XmiClassElement
	 * @param id
	 *            of target element
	 * @return XmiClassElement if found, else ""
	 */
	public static String getClassNameById(ArrayList<XmiClassElement> array,
			String id) {

		for (XmiClassElement element : array) {
			if (element.getId().equals(id)) {
				return element.getName();
			}
		}
		return "";
	}

	/**
	 * Gets the Base name from the ArrayList of XmiBaseElement
	 * 
	 * @param array
	 *            of XmiBaseElement
	 * @param id
	 *            of target element
	 * @return XmiBaseElement if found, else ""
	 */
	public static String getBaseNameById(ArrayList<XmiBaseElement> array,
			String id) {

		for (XmiBaseElement element : array) {
			System.out.println(element.getId());
			if (element.getId().equals(id)) {
				return element.getName();
			}
		}
		return "";
	}

	public static XmiAssociationElement getAssociationById(
			ArrayList<XmiAssociationElement> array, String id) {

		for (XmiAssociationElement element : array) {
			System.out.println(element.getId());
			if (element.getId().equals(id)) {
				return element;
			}
		}
		return null;
	}

	public static XmiClassElement getClassById(List<XmiClassElement> array,
			String id) {
		for (XmiClassElement element : array) {
			if (element.getId().equals(id)) {
				return element;
			}
		}

		return null;
	}

	public static XmiClassElement getClassByName(List<XmiClassElement> array,
			String name) {
		for (XmiClassElement element : array) {
			if (element.getName().equals(name)) {
				return element;
			}
		}

		return null;
	}

	public static XmiAttributeElement getAttributebyName(XmiClassElement classname, String attrName ) {
		ArrayList<XmiAttributeElement> attrlist = classname.getAttributes();
		for (XmiAttributeElement elem : attrlist) {
			if (elem.getName().equals(attrName)) {
				return elem;
			}
		}
		return null;
	}
	
	public static XmiOperationElement getOperationbyName(XmiClassElement classname, String attrName ) {
		ArrayList<XmiOperationElement> operlist = classname.getOperations();
		for (XmiOperationElement elem : operlist) {
			if (elem.getName().equals(attrName)) {
				return elem;
			}
		}
		return null;
	}
	/**
	 * Compares 2 class elements' attributes
	 * 
	 * @param classElement1
	 * @param classElement2
	 * @return true if all attributes are the same, else false
	 */
	public boolean compareClassAttributes(XmiClassElement classElement1,
			XmiClassElement classElement2) {
		
				ArrayList<XmiAttributeElement> attr1 = new ArrayList<XmiAttributeElement>();
				ArrayList<XmiAttributeElement> attr2 = new ArrayList<XmiAttributeElement>();
				
				attr1 = classElement1.getAttributes();
				attr2 = classElement2.getAttributes();
				
				Collections.sort((List)attr1);
				Collections.sort((List)attr2);
										
				
				return attr1.equals(attr2);

	}

	/**
	 * Compares 2 class elements' operations
	 * 
	 * @param classElement1
	 * @param classElement2
	 * @return true if all operations are the same, else false
	 */
	public boolean compareClassOperations(XmiClassElement classElement1,
			XmiClassElement classElement2) {
			
				ArrayList<XmiOperationElement> attr1 = new ArrayList<XmiOperationElement>();
				ArrayList<XmiOperationElement> attr2 = new ArrayList<XmiOperationElement>();
				
				attr1 = classElement1.getOperations();
				attr2 = classElement2.getOperations();
				
		
				Collections.sort((List)attr1);
				Collections.sort((List)attr2);
										
				
				return attr1.equals(attr2);
	}

	/**
	 * check if the class exist in the arrayList of XmiMergedClass 
	 * @param List<XmiMergedClass>
	 * @param className
	 * @return true if className exist in the arrayList of XmiMergedClass
	 * 		   false if className not exist in the arrayList of XmiMergedClass 
	 */
	public static boolean checkExistXmiMergedClass(List<XmiMergedClass> array,
			String className) {		
		for (XmiMergedClass classElement : array) {
			if (classElement.getNewName().equals(className)) {
				return true;
			}
		}
		return false;
	}
}
