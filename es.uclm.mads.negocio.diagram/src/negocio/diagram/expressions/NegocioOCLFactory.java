package negocio.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import negocio.diagram.part.NegocioDiagramEditorPlugin;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class NegocioOCLFactory {

	/**
	 * @generated
	 */
	private final NegocioAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected NegocioOCLFactory() {
		this.expressions = new NegocioAbstractExpression[8];
		this.expressionBodies = new String[] {
				"self.negocio.productos.id\n->union(self.negocio.personas.id)\n->union(self.negocio.valores.id)\n->union(self.negocio.documentos.id)\n->iterate(i:Integer; max:Integer=0| if (i > max) then i else max endif) + 1", //$NON-NLS-1$
				"\'Persona\'.concat(let number: Integer = self.id in OrderedSet{1000000, 10000, 1000, 100, 10, 1}\r\n->iterate(denominator : Integer; s : String = \'\' |\r\nlet numberAsString : String = OrderedSet{\'0\',\'1\',\'2\',\'3\',\'4\',\'5\',\'6\',\'7\',\'8\',\'9\'}\r\n->at(number.div(denominator).mod(10) + 1)  in\r\nif s=\'\' and numberAsString = \'0\' then s else s.concat(numberAsString) endif))", //$NON-NLS-1$
				"self.negocio.documentos->excludes(self)", //$NON-NLS-1$
				"if self.persona.oclIsUndefined() then \'Undefined\' else self.persona.nombre endif", //$NON-NLS-1$
				"let n:Negocio = self.negocio in \nn.documentos->forAll(d| d<>self implies d.id<>id) and\nn.personas->forAll(d| d<>self implies d.id<>id) and\nn.productos->forAll(d| d<>self implies d.id<>id) and\nn.valores->forAll(d| d<>self implies d.id<>id)", //$NON-NLS-1$
				"self.at(1) = self.at(1).toUpperCase()", //$NON-NLS-1$
				"pagos.documento->excludes(justificante)", //$NON-NLS-1$
				"producto->forAll(p:Producto | p.oclIsTypeOf(Producto))\nor\nproducto->forAll(p:Producto | p.oclIsTypeOf(Servicio))", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static NegocioOCLFactory getInstance() {
		NegocioOCLFactory instance = NegocioDiagramEditorPlugin.getInstance()
				.getNegocioOCLFactory();
		if (instance == null) {
			NegocioDiagramEditorPlugin.getInstance().setNegocioOCLFactory(
					instance = new NegocioOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static NegocioAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		NegocioOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static NegocioAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static NegocioAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends NegocioAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
