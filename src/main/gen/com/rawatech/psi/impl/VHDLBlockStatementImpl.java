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

public class VHDLBlockStatementImpl extends ASTWrapperPsiElement implements VHDLBlockStatement {

  public VHDLBlockStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitBlockStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLBlockDeclarativePart getBlockDeclarativePart() {
    return findNotNullChildByClass(VHDLBlockDeclarativePart.class);
  }

  @Override
  @NotNull
  public VHDLBlockHeader getBlockHeader() {
    return findNotNullChildByClass(VHDLBlockHeader.class);
  }

  @Override
  @NotNull
  public VHDLBlockStatementPart getBlockStatementPart() {
    return findNotNullChildByClass(VHDLBlockStatementPart.class);
  }

}
