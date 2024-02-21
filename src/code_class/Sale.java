package code_class;

public class Sale {

        private final Customer customer;
        private final double serviceexpense;
        private final double productexpense;
        public Sale(Customer customer, double serviceExpense, double productExpense) {
            this.customer = customer;
            this.serviceexpense = serviceExpense;
            this.productexpense = productExpense;
        }

        public void displayInfo() {
            System.out.println("Customer: " + customer.getCustomerName());
            System.out.println("Service spend moneyy:" + serviceexpense);
            System.out.println("Product spend money:" + productexpense);
            System.out.println("==================================================================");
            double serviceDiscount = serviceexpense * customer.getServiceMemberDiscount();
            double productDiscount = productexpense * customer.getProductMemberDiscount();
            System.out.println("Service Discount:" + serviceDiscount);
            System.out.println("Product Discount:" + productDiscount);
            System.out.println("==================================================================");
        }
    }

