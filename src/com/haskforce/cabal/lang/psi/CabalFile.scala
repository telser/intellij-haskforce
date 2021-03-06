package com.haskforce.cabal.lang.psi

import com.haskforce.cabal.CabalFileType
import com.haskforce.cabal.CabalIcons
import com.haskforce.cabal.CabalLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import javax.swing._

class CabalFile(viewProvider: FileViewProvider)
  extends PsiFileBase(viewProvider, CabalLanguage.INSTANCE) {

  lazy val getFileType: FileType = CabalFileType.INSTANCE

  override val toString: String = "Cabal File"

  override def getIcon(flags: Int): Icon = CabalIcons.FILE
}
