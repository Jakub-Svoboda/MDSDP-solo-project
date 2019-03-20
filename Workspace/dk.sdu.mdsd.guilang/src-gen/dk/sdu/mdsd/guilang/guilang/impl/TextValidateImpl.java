/**
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.guilang.guilang.impl;

import dk.sdu.mdsd.guilang.guilang.GuilangPackage;
import dk.sdu.mdsd.guilang.guilang.TextValidate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Validate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.guilang.guilang.impl.TextValidateImpl#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextValidateImpl extends InputSpecOptionsImpl implements TextValidate
{
  /**
   * The cached value of the '{@link #getValidation() <em>Validation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidation()
   * @generated
   * @ordered
   */
  protected EObject validation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextValidateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GuilangPackage.Literals.TEXT_VALIDATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getValidation()
  {
    return validation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidation(EObject newValidation, NotificationChain msgs)
  {
    EObject oldValidation = validation;
    validation = newValidation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuilangPackage.TEXT_VALIDATE__VALIDATION, oldValidation, newValidation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValidation(EObject newValidation)
  {
    if (newValidation != validation)
    {
      NotificationChain msgs = null;
      if (validation != null)
        msgs = ((InternalEObject)validation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuilangPackage.TEXT_VALIDATE__VALIDATION, null, msgs);
      if (newValidation != null)
        msgs = ((InternalEObject)newValidation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuilangPackage.TEXT_VALIDATE__VALIDATION, null, msgs);
      msgs = basicSetValidation(newValidation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuilangPackage.TEXT_VALIDATE__VALIDATION, newValidation, newValidation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GuilangPackage.TEXT_VALIDATE__VALIDATION:
        return basicSetValidation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GuilangPackage.TEXT_VALIDATE__VALIDATION:
        return getValidation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GuilangPackage.TEXT_VALIDATE__VALIDATION:
        setValidation((EObject)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GuilangPackage.TEXT_VALIDATE__VALIDATION:
        setValidation((EObject)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GuilangPackage.TEXT_VALIDATE__VALIDATION:
        return validation != null;
    }
    return super.eIsSet(featureID);
  }

} //TextValidateImpl