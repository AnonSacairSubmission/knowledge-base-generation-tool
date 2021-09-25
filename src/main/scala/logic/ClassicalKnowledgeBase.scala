package kbgt.logic

import kbgt._
import scala.jdk.CollectionConverters._
import scala.collection.mutable.ListBuffer
import org.tweetyproject.logics.pl.syntax._
import org.tweetyproject.logics.pl.sat._
import org.tweetyproject.logics.pl.reasoner.SatReasoner
import java.io.PrintWriter
import java.io.File
import scala.collection.mutable
import java.io.FileWriter
import scala.io.Source

/** A classical propositional knowledge base.
  *
  * Extends [[kbgt.logic.KnowledgeBase]]
  *
  * @constructor
  *   create a new classical knowledge base with a sequence of classical
  *   formulas
  * @param formulas
  *   the sequence of classical formulas.
  */
class ClassicalKnowledgeBase(formulas: ClassicalFormula*)
    extends KnowledgeBase[ClassicalFormula](
      mutable.Set[ClassicalFormula](formulas: _*)
    ) {

  /** Checks whether a given classical formula is entailed by the classical
    * knowledge base.
    *
    * @param formula
    *   the classical formula to check entailment of
    * @return
    *   true if the classical formula is entailed, false if otherwise
    */
  def entails(formula: ClassicalFormula): Boolean =
    reasoner.query(toPlBeliefSet, formula.getPlFormula())

  /** clone override. */
  override def clone(): ClassicalKnowledgeBase =
    new ClassicalKnowledgeBase(iterator.toSeq: _*)

}
