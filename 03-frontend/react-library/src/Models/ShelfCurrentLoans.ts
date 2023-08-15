import Bookmodel from "./Bookmodel";

class ShelfCurrentLoans{
    book : Bookmodel;
    daysLeft : number;

    constructor(book : Bookmodel, daysLeft : number){
        this.book = book;
        this.daysLeft = daysLeft;
    }
}
export default ShelfCurrentLoans;