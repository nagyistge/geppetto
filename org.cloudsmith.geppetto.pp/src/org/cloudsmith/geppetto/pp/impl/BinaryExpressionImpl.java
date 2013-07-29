/**
 * Copyright (c) 2013 Puppet Labs, Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Puppet Labs
 */
package org.cloudsmith.geppetto.pp.impl;

import org.cloudsmith.geppetto.pp.BinaryExpression;
import org.cloudsmith.geppetto.pp.Expression;
import org.cloudsmith.geppetto.pp.PPPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.cloudsmith.geppetto.pp.impl.BinaryExpressionImpl#getLeftExpr <em>Left Expr</em>}</li>
 * <li>{@link org.cloudsmith.geppetto.pp.impl.BinaryExpressionImpl#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The cached value of the '{@link #getLeftExpr() <em>Left Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLeftExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression leftExpr;

	/**
	 * The cached value of the '{@link #getRightExpr() <em>Right Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRightExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression rightExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLeftExpr(Expression newLeftExpr, NotificationChain msgs) {
		Expression oldLeftExpr = leftExpr;
		leftExpr = newLeftExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PPPackage.BINARY_EXPRESSION__LEFT_EXPR, oldLeftExpr, newLeftExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRightExpr(Expression newRightExpr, NotificationChain msgs) {
		Expression oldRightExpr = rightExpr;
		rightExpr = newRightExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, PPPackage.BINARY_EXPRESSION__RIGHT_EXPR, oldRightExpr, newRightExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case PPPackage.BINARY_EXPRESSION__LEFT_EXPR:
				return getLeftExpr();
			case PPPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				return getRightExpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case PPPackage.BINARY_EXPRESSION__LEFT_EXPR:
				return basicSetLeftExpr(null, msgs);
			case PPPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				return basicSetRightExpr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case PPPackage.BINARY_EXPRESSION__LEFT_EXPR:
				return leftExpr != null;
			case PPPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				return rightExpr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case PPPackage.BINARY_EXPRESSION__LEFT_EXPR:
				setLeftExpr((Expression) newValue);
				return;
			case PPPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				setRightExpr((Expression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PPPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case PPPackage.BINARY_EXPRESSION__LEFT_EXPR:
				setLeftExpr((Expression) null);
				return;
			case PPPackage.BINARY_EXPRESSION__RIGHT_EXPR:
				setRightExpr((Expression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Expression getLeftExpr() {
		return leftExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Expression getRightExpr() {
		return rightExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLeftExpr(Expression newLeftExpr) {
		if(newLeftExpr != leftExpr) {
			NotificationChain msgs = null;
			if(leftExpr != null)
				msgs = ((InternalEObject) leftExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						PPPackage.BINARY_EXPRESSION__LEFT_EXPR, null, msgs);
			if(newLeftExpr != null)
				msgs = ((InternalEObject) newLeftExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						PPPackage.BINARY_EXPRESSION__LEFT_EXPR, null, msgs);
			msgs = basicSetLeftExpr(newLeftExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PPPackage.BINARY_EXPRESSION__LEFT_EXPR, newLeftExpr, newLeftExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRightExpr(Expression newRightExpr) {
		if(newRightExpr != rightExpr) {
			NotificationChain msgs = null;
			if(rightExpr != null)
				msgs = ((InternalEObject) rightExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						PPPackage.BINARY_EXPRESSION__RIGHT_EXPR, null, msgs);
			if(newRightExpr != null)
				msgs = ((InternalEObject) newRightExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						PPPackage.BINARY_EXPRESSION__RIGHT_EXPR, null, msgs);
			msgs = basicSetRightExpr(newRightExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, PPPackage.BINARY_EXPRESSION__RIGHT_EXPR, newRightExpr, newRightExpr));
	}

} // BinaryExpressionImpl
