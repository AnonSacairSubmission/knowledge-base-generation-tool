package kbgt.logic

import kbgt._
import scala.collection.mutable.ListBuffer
import org.tweetyproject.logics.pl.syntax._
import org.tweetyproject.logics.pl.sat._
import org.tweetyproject.logics.pl.reasoner.SatReasoner
import java.io.PrintWriter
import java.io.File
import scala.collection.mutable

/** A defeasible implication.
  *
  * Extends [[kbgt.logic.Formula]]
  * @constructor
  *   create a new defeasible formula with an antecedent and consequent
  * @param antecedent
  *   the defeasible formula's antecedent
  * @param consequent
  *   the defeasible formula's consequent
  */
case class DefeasibleFormula(
    antecedent: ClassicalFormula,
    consequent: ClassicalFormula
) extends Formula {

  /** Gets the materialization of the defeasible formula.
    *
    * @return
    *   classical formula materialization of the defeasible formula.
    */
  def getMaterialization(): ClassicalFormula =
    BinCon(BinOp.Implies, antecedent, consequent)

  /** Gets the antecedent of the defeasible formula.
    *
    * @return
    *   the classical formula antecedent of the defeasible formula
    */
  def getAntecedent(): ClassicalFormula = antecedent

  /** Gets the consequent of the defeasible formula.
    *
    * @return
    *   the classical formula consequent of the defeasible formula
    */
  def getConsequent(): ClassicalFormula = consequent

  /** Gets the defeasible formula's TweetyProject counterpart.
    *
    * @return
    *   PlFormula counterpart of the defeasible formula
    */
  override def getPlFormula() =
    new Implication(antecedent.getPlFormula(), consequent.getPlFormula())

  /** toString override. */
  override def toString(): String = s"$antecedent~>$consequent"

}
