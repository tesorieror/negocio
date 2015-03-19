/**
 */
package negocio;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see negocio.NegocioPackage
 * @generated
 */
public interface NegocioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NegocioFactory eINSTANCE = negocio.impl.NegocioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negocio</em>'.
	 * @generated
	 */
	Negocio createNegocio();

	/**
	 * Returns a new object of class '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persona</em>'.
	 * @generated
	 */
	Persona createPersona();

	/**
	 * Returns a new object of class '<em>Producto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Producto</em>'.
	 * @generated
	 */
	Producto createProducto();

	/**
	 * Returns a new object of class '<em>Documento Comercial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documento Comercial</em>'.
	 * @generated
	 */
	DocumentoComercial createDocumentoComercial();

	/**
	 * Returns a new object of class '<em>Atributo Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Simple</em>'.
	 * @generated
	 */
	AtributoSimple createAtributoSimple();

	/**
	 * Returns a new object of class '<em>Atributo Compuesto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Compuesto</em>'.
	 * @generated
	 */
	AtributoCompuesto createAtributoCompuesto();

	/**
	 * Returns a new object of class '<em>Valor Directo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valor Directo</em>'.
	 * @generated
	 */
	ValorDirecto createValorDirecto();

	/**
	 * Returns a new object of class '<em>Valor Indirecto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valor Indirecto</em>'.
	 * @generated
	 */
	ValorIndirecto createValorIndirecto();

	/**
	 * Returns a new object of class '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicio</em>'.
	 * @generated
	 */
	Servicio createServicio();

	/**
	 * Returns a new object of class '<em>Pago</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pago</em>'.
	 * @generated
	 */
	Pago createPago();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NegocioPackage getNegocioPackage();

} //NegocioFactory
