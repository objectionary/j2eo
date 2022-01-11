package tree.Declaration;

import tree.Entity;
import tree.Type.TypeParameters;

// Intermediate class: won't appear in the AST.
//
// ConstructorDeclarator
//    : TypeParametersOpt IDENTIFIER LPAREN FormalParameterList/*FormalParameters*/ RPAREN
//    ;
public class ConstructorDeclarator extends Entity {
    // Structure
    public TypeParameters typeParameters;
    public ParameterDeclarations formalParameters;

    // Creation
    public ConstructorDeclarator(TypeParameters tpars, ParameterDeclarations pars) {
        this.typeParameters = tpars;
        this.formalParameters = pars;
    }

    // Reporting
    public void report(int sh) {
        // Empty
    }

}
