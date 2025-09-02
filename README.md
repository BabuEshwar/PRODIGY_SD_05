# PRODIGY_SD_05

# Web Scraping Project – Prodigy Infotech Internship

## Overview
This Java console application demonstrates web scraping techniques by extracting product information (name, price, rating) from an e-commerce website and saving the data to a structured CSV file. For ethical and legal reasons, the code uses the "Books to Scrape" website, designed specifically for scraping education and practice.

## Features
- Scrapes product names, prices, and ratings from a sample e-commerce site.
- Exports extracted data to a neatly formatted CSV file.
- Robust error handling and modular code structure.
- Uses JSoup for HTML parsing (https://jsoup.org/).

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- JSoup library (add jsoup-x.x.x.jar to your project, see https://jsoup.org/download)

### Installation & Running
1. Clone the repository:
git clone https://github.com/yourusername/web-scraping-project.git

2. Import the project into your IDE and add JSoup to your build path.
3. Compile and run the program:
javac WebScraper.java
java WebScraper


### Sample Output
✅ Data saved successfully to products.csv
The CSV file contains:
Name,Price,Rating
"A Light in the ...","£51.77","Three"
" Tipping the Velvet","£53.74","One"
...


## Code Highlights
- Modular design with separate classes/methods for web fetching, data parsing, and CSV writing.
- Graceful error handling for network and IO exceptions.
- Portfolio-ready demonstration of web scraping, data cleaning, and export in Java.

## Demo Site
- URL scraped: [Books to Scrape](http://books.toscrape.com/)
- NOTE: Do not scrape live e-commerce sites for portfolio; always use demo, sample, or API-provided data.

## Skills Demonstrated
- Web scraping with JSoup
- Data cleaning and export to CSV
- Object-oriented programming
- Error handling and reporting

## Author
R. BABU ESHWAR
Intern, Prodigy Infotech

## License
MIT License
