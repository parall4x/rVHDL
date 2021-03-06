// This is a generated file. Not intended for manual editing.
package com.rawatech.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.rawatech.psi.VHDLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rawatech.psi.*;

public class VHDLAttributeNameImpl extends ASTWrapperPsiElement implements VHDLAttributeName {

  public VHDLAttributeNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitAttributeName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLAttributeDesignator getAttributeDesignator() {
    return findNotNullChildByClass(VHDLAttributeDesignator.class);
  }

  @Override
  @Nullable
  public VHDLExpression getExpression() {
    return findChildByClass(VHDLExpression.class);
  }

  @Override
  @NotNull
  public VHDLPrefix getPrefix() {
    return findNotNullChildByClass(VHDLPrefix.class);
  }

  @Override
  @Nullable
  public VHDLSignature getSignature() {
    return findChildByClass(VHDLSignature.class);
  }

}
