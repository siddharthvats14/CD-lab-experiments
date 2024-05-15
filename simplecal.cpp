#include <iostream>
#include <sstream>
#include <string>

using namespace std;

double evaluate(const string& expression) {
    istringstream expr(expression);
    double result, term;
    char op = '+';

    expr >> result;
    while (expr >> op >> term) {
        switch (op) {
            case '+': result += term; break;
            case '-': result -= term; break;
            case '*': result *= term; break;
            case '/': 
                if (term == 0) {
                    cerr << "Error: Division by zero" << endl;
                    return 0; // Or handle the error as needed
                }
                result /= term; 
                break;
            default:
                cerr << "Error: Invalid operator " << op << endl;
                return 0; // Or handle the error as needed
        }
    }
    return result;
}

int main() {
    string expression;
    cout << "Enter an expression: ";
    getline(cin, expression);

    double result = evaluate(expression);
    cout << "Result: " << result << endl;

    return 0;
}