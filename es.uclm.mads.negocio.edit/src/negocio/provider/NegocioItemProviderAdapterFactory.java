/**
 */
package negocio.provider;

import java.util.ArrayList;
import java.util.Collection;

import negocio.util.NegocioAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NegocioItemProviderAdapterFactory extends NegocioAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegocioItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.Negocio} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegocioItemProvider negocioItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.Negocio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNegocioAdapter() {
		if (negocioItemProvider == null) {
			negocioItemProvider = new NegocioItemProvider(this);
		}

		return negocioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.Persona} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaItemProvider personaItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersonaAdapter() {
		if (personaItemProvider == null) {
			personaItemProvider = new PersonaItemProvider(this);
		}

		return personaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.Producto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductoItemProvider productoItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.Producto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductoAdapter() {
		if (productoItemProvider == null) {
			productoItemProvider = new ProductoItemProvider(this);
		}

		return productoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.DocumentoComercial} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentoComercialItemProvider documentoComercialItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.DocumentoComercial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentoComercialAdapter() {
		if (documentoComercialItemProvider == null) {
			documentoComercialItemProvider = new DocumentoComercialItemProvider(this);
		}

		return documentoComercialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.AtributoSimple} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoSimpleItemProvider atributoSimpleItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.AtributoSimple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtributoSimpleAdapter() {
		if (atributoSimpleItemProvider == null) {
			atributoSimpleItemProvider = new AtributoSimpleItemProvider(this);
		}

		return atributoSimpleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.AtributoCompuesto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoCompuestoItemProvider atributoCompuestoItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.AtributoCompuesto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtributoCompuestoAdapter() {
		if (atributoCompuestoItemProvider == null) {
			atributoCompuestoItemProvider = new AtributoCompuestoItemProvider(this);
		}

		return atributoCompuestoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.ValorDirecto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValorDirectoItemProvider valorDirectoItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.ValorDirecto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValorDirectoAdapter() {
		if (valorDirectoItemProvider == null) {
			valorDirectoItemProvider = new ValorDirectoItemProvider(this);
		}

		return valorDirectoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.ValorIndirecto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValorIndirectoItemProvider valorIndirectoItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.ValorIndirecto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValorIndirectoAdapter() {
		if (valorIndirectoItemProvider == null) {
			valorIndirectoItemProvider = new ValorIndirectoItemProvider(this);
		}

		return valorIndirectoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.Servicio} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicioItemProvider servicioItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.Servicio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServicioAdapter() {
		if (servicioItemProvider == null) {
			servicioItemProvider = new ServicioItemProvider(this);
		}

		return servicioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link negocio.Pago} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagoItemProvider pagoItemProvider;

	/**
	 * This creates an adapter for a {@link negocio.Pago}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPagoAdapter() {
		if (pagoItemProvider == null) {
			pagoItemProvider = new PagoItemProvider(this);
		}

		return pagoItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (negocioItemProvider != null) negocioItemProvider.dispose();
		if (personaItemProvider != null) personaItemProvider.dispose();
		if (productoItemProvider != null) productoItemProvider.dispose();
		if (documentoComercialItemProvider != null) documentoComercialItemProvider.dispose();
		if (atributoSimpleItemProvider != null) atributoSimpleItemProvider.dispose();
		if (atributoCompuestoItemProvider != null) atributoCompuestoItemProvider.dispose();
		if (valorDirectoItemProvider != null) valorDirectoItemProvider.dispose();
		if (valorIndirectoItemProvider != null) valorIndirectoItemProvider.dispose();
		if (servicioItemProvider != null) servicioItemProvider.dispose();
		if (pagoItemProvider != null) pagoItemProvider.dispose();
	}

}
