class Book:
    def __init__(self, title, author, genre, publication_year):
        self.title = title
        self.author = author
        self.genre = genre
        self.publication_year = publication_year

class ExpertSystem:
    def __init__(self):
        self.books = []

    def add_book(self, title, author, genre, publication_year):
        book = Book(title, author, genre, publication_year)
        self.books.append(book)

    def search_books_by_author(self, author):
        result = [book for book in self.books if book.author.lower() == author.lower()]
        return result

    def search_books_by_genre(self, genre):
        result = [book for book in self.books if book.genre.lower() == genre.lower()]
        return result

    def search_books_by_publication_year(self, year):
        result = [book for book in self.books if book.publication_year == year]
        return result

# Example usage:
expert_system = ExpertSystem()
expert_system.add_book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 1925)
expert_system.add_book("To Kill a Mockingbird", "Harper Lee", "Fiction", 1960)
expert_system.add_book("1984", "George Orwell", "Dystopian", 1949)

print("Books by George Orwell:")
for book in expert_system.search_books_by_author("George Orwell"):
    print(book.title)

print("\nDystopian Books:")
for book in expert_system.search_books_by_genre("Dystopian"):
    print(book.title)

print("\nBooks published in 1960:")
for book in expert_system.search_books_by_publication_year(1960):
    print(book.title)
